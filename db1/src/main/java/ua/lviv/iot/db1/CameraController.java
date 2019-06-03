package ua.lviv.iot.db1;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/Camera")
public class CameraController {

  @Autowired
  CameraRepository cameraRepository;

 

  @GetMapping("/Camera")
  public List getAllTickets() {
    return  (List) cameraRepository.findAll();
  }



  @GetMapping("/Camera/{id}")
  public Camera getTicket(@PathVariable Integer id) {
    return cameraRepository.findById(id).get();
  }

  @PostMapping("/Camera")
    public Camera createCamera(@RequestBody Camera camera) {
    Camera savedCamera = cameraRepository.save(camera);
    return savedCamera;
  }

  @PutMapping("/Camera/{id}")
   public  Camera updateCamera(
      @RequestBody Camera changedCamera, @PathVariable Integer id) {
    cameraRepository.save(changedCamera);
    return changedCamera;
  }

  @DeleteMapping("/Camera/{id}")
  public String deleteTicket(@PathVariable Integer id) {
   cameraRepository.deleteById(id);
    return String.format("Camera id #%d successfully deleted", id);
  }
}