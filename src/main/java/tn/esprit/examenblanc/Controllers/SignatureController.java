package tn.esprit.examenblanc.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenblanc.Entities.Signature;
import tn.esprit.examenblanc.Repository.SignatureRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SignatureController {

    @Autowired
    private SignatureRepository signatureRepository;

    @PostMapping("/signature")
    public ResponseEntity<?> saveSignature(@RequestBody SignatureRequest request) {
        signatureRepository.deleteAll();
        Signature signature = new Signature();
        signature.setSignatureData(request.getSignature());
        signatureRepository.save(signature);
        return ResponseEntity.ok(new ResponseMessage("Signature saved successfully!"));

    }

    @GetMapping("/signature")
    public List<Signature> getAllSignatures() {
        return signatureRepository.findAll();
    }
    public static class SignatureRequest {
        private String signature;

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }
    }

    public static class ResponseMessage {
        private String message;

        public ResponseMessage(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}