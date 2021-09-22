/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeutifulSalon.Ferramentas;

import BeutifulSalon.controller.CabeleireiroController;
import BeutifulSalon.controller.ClienteController;
import BeutifulSalon.controller.OrcamentoController;
import BeutifulSalon.controller.ServicoController;
import BeutifulSalon.model.Cabeleireiro;
import BeutifulSalon.model.Orcamento;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamDiscoveryService;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;





/**
 *
 * @author mateus
 */
public class testes {

    public static void main(String[] args) throws IOException, TimeoutException {

       
       List<Orcamento> ocs = new OrcamentoController().listarOrcamentos("2021");
       
       
      long valorTotalOrc = 0;
      
      for(Orcamento o: ocs){
          valorTotalOrc += o.getSomaTotalAnual();
      }
      
        System.out.println("Ponto de equilibrio =>"+ Math.floor((valorTotalOrc/15)/126.38));
        
     
    }
}
