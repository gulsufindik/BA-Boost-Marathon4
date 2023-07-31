package com.gulsufindik.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Tüm controller sınıfları için merkezi bir şekilde hata yönetimi sağlayan anotasyondur.
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    private ErrorMesaj createErrorMesaj(EerrorType eerrorType, Exception exception){
        System.out.println("Hata oluştu...."+exception.getMessage());
        return ErrorMesaj.builder()
                .code(eerrorType.getCode())
                .mesaj(eerrorType.getMesaj())
                .build();
    }

    /**
     * ExceptionHandler: Uygulama içinde oluşacak hatanın türünü verdiğimiz şekilde yakalanmasını sağlar.
     * ResponseBody: Dönüş tipimizin formatının Json olmasını sağlar.
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<String> handleException(Exception e){
        //log tutabilirsin, db'e kayıt işlemleri...

        return ResponseEntity.badRequest().body("Uygulamada bad request gerçekleşti..."+e.getMessage());
    }

    @ExceptionHandler(KullaniciServiceException.class)
    @ResponseBody
    public ResponseEntity<ErrorMesaj> handleSatisException(KullaniciServiceException e){
        EerrorType eerrorType=e.getType();
        HttpStatus httpStatus=eerrorType.getStatus();
        return new ResponseEntity<ErrorMesaj>(createErrorMesaj(eerrorType,e),httpStatus);
    }
}