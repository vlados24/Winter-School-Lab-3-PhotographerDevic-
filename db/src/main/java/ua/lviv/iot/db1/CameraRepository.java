package ua.lviv.iot.db1;

import org.springframework.data.repository.CrudRepository;

import ua.lviv.iot.photo.Camera;

public interface CameraRepository extends CrudRepository<Camera, Integer> {}