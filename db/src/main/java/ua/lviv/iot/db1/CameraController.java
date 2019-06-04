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

import ua.lviv.iot.photo.Camera;



@RestController
@RequestMapping(value = "/camera")
public class CameraController {

  @Autowired
  CameraRepository cameraRepository;

   @GetMapping("/camera")
  public List getAllTickets() {
    return  (List) cameraRepository.findAll();
  }

  @GetMapping("/camera/{id}")
  public Camera getTicket(@PathVariable Integer id) {
    return cameraRepository.findById(id).get();
  }

  @PostMapping("/camera")
    public Camera createCamera(@RequestBody Camera camera) {
    Camera savedCamera = cameraRepository.save(camera);
    return savedCamera;

  }

  @PutMapping("/camera/{id}")
   public  Camera updateCamera(
      @RequestBody Camera changedCamera, @PathVariable Integer id) {
    cameraRepository.save(changedCamera);
    return changedCamera;
 }

  @DeleteMapping("/camera/{id}")
  public String deleteTicket(@PathVariable Integer id) {
    cameraRepository.deleteById(id);
    return String.format("Camera id #%d successfully deleted", id);
  }
}