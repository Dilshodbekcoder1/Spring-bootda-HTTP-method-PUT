package uz.mohirdev.lesson.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.mohirdev.lesson.model.Student;

@RestController
@RequestMapping("/api")
public class StudentResource {

 @GetMapping ("/students")
   public ResponseEntity hello() {
        return ResponseEntity.ok("Hello world mohirdev");
   }

 @PostMapping("/students")
 public ResponseEntity create(@RequestBody Student student){
     return ResponseEntity.ok(student);

 }

 @PutMapping("/students")
    public ResponseEntity update(@RequestBody Student student){
     student.setLastName("test uchun");
     return ResponseEntity.ok(student);
 }
    @PutMapping("/students/{id}")
    public ResponseEntity updateSecond(@PathVariable Long id,
                                       @RequestBody Student student){
        student.setLastName("test uchun");
        student.setId(id);
        return ResponseEntity.ok(student);

        
    }





}
