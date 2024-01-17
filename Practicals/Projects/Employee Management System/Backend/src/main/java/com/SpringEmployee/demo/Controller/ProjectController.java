package com.SpringEmployee.demo.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringEmployee.demo.Exception.LeaveNotFoundException;
import com.SpringEmployee.demo.Exception.ProjectNotFoundException;
import com.SpringEmployee.demo.Model.Leave;
import com.SpringEmployee.demo.Model.Project;
import com.SpringEmployee.demo.Repository.ProjectRepository;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1/projects")
@RestController
public class ProjectController {

    @Autowired
    private ProjectRepository pr;

    @GetMapping
    public List<Project> getAllProject() {
        return pr.findAll();
    }

    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return pr.save(project);
    }

    @PutMapping("/{projectId}")
    public ResponseEntity<Project> updateProject(@RequestBody Project projectdetails, @PathVariable int projectId) {
        Project project = pr.findById(projectId).orElseThrow(() -> new ProjectNotFoundException("ID Not Found"));
        project.setDeptName(projectdetails.getDeptName());
        project.setEmployeeName(projectdetails.getEmployeeName());
        project.setProjectId(projectdetails.getProjectId());
        project.setProjectName(projectdetails.getProjectName());
        Project updateproject = pr.save(project);
        return ResponseEntity.ok(updateproject);
    }

    @DeleteMapping("/{projectId}")
    public ResponseEntity<Map<String, Boolean>> deleteProject(@PathVariable int projectId) {
        Project project = pr.findById(projectId).orElseThrow(() -> new ProjectNotFoundException("ID Not Found"));
        pr.delete(project);
        Map<String, Boolean> response = new HashMap<>();
        return ResponseEntity.ok(response);
    }

    @CrossOrigin(origins="http://localhost:4200")
    @GetMapping("/proj/name/{projectName}")
    public ResponseEntity<List<Project>> getProjectsByName(@PathVariable String projectName) {
      // Implement your logic to get projects by name
      List<Project> projects = pr.findByProjectName(projectName);
      return new ResponseEntity<>(projects, HttpStatus.OK);
    }
    @CrossOrigin(origins="http://localhost:4200")
    @GetMapping("/proj/id/{projectId}")
    public ResponseEntity<Project> getProjectById(@PathVariable int projectId) {
        Project project = pr.findById(projectId).orElseThrow(() -> new ProjectNotFoundException("ID Not Found"));
        return ResponseEntity.ok(project);
    }
    @CrossOrigin(origins="http://localhost:4200")
    @GetMapping("/department/{deptName}")
    public List<Project> getBydeptName(@PathVariable String deptName) {
        return pr.findByDeptName(deptName);
    }
}
