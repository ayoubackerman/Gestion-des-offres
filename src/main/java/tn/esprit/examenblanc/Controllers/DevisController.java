package tn.esprit.examenblanc.Controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenblanc.Entities.Devi;
import tn.esprit.examenblanc.Repository.DeviRepository;
import tn.esprit.examenblanc.Services.pdf.PdfService;
import tn.esprit.examenblanc.dto.Devidto;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/devi")
public class DevisController {

    @Autowired
    PdfService pdfService;
    @Autowired
    DeviRepository deviRepository;


    @GetMapping("")

    ResponseEntity<List<Devidto>> GetAll(){
        List<Devidto> list = pdfService.getAllDevi();
        return ResponseEntity.status(HttpStatus.CREATED).body(list);

    }

    @PostMapping("/Add")
    //@PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Devidto> addDevi(@ModelAttribute Devidto devidto) throws IOException {
        Devidto devidto1 = pdfService.addDevi(devidto);
        return ResponseEntity.status(HttpStatus.CREATED).body(devidto1);

    }

    @DeleteMapping("/delete/{id}")
    // @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> deletedevi(@PathVariable Long id){
        boolean delete = pdfService.deletedevi(id);
        if (delete){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/devis/pdf")
    public ResponseEntity<byte[]> generateDevisPdf() {
        List<Devi> l = deviRepository.findAll();
        ByteArrayInputStream bais = pdfService.devisToPdf(l);

        byte[] pdfContent = bais.readAllBytes();
        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_PDF)
                .body(pdfContent);
    }
}
