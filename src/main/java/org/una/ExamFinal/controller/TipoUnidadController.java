/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.ExamFinal.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.una.ExamFinal.dto.TipoUnidadDto;
import org.una.ExamFinal.services.ITipoUniadadService;

/**
 *
 * @author roberth
 */
@RestController
@RequestMapping("/tiposUnidades")
public class TipoUnidadController {

    @Autowired
    private ITipoUniadadService tipoUService;

    @GetMapping("findAll")
    @ResponseBody
    public ResponseEntity<?> findAll() {
        try {
            List<TipoUnidadDto> result = tipoUService.findAll();
            if (!result.isEmpty()) {
                return new ResponseEntity<>(result, HttpStatus.OK);
            }
            return new ResponseEntity<>("Sin resultados", HttpStatus.NO_CONTENT);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
