package tn.esprit.spring.kaddem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tn.esprit.spring.kaddem.entities.Etudiant;
import tn.esprit.spring.kaddem.repositories.EtudiantRepository;
import tn.esprit.spring.kaddem.services.EtudiantServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


public class TestsEtudiantService {

    @Mock
    private EtudiantRepository etudiantRepository;

    @InjectMocks
    private EtudiantServiceImpl etudiantService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void RetrieveAllEtudiantsWithMock() {
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant("John", "Doe"));
        etudiants.add(new Etudiant("Jane", "Smith"));

        when(etudiantRepository.findAll()).thenReturn(etudiants);

        List<Etudiant> retrievedEtudiants = etudiantService.retrieveAllEtudiants();

        assertEquals(etudiants.size(), retrievedEtudiants.size());
    }

    @Test
    public void testRetrieveAllEtudiantsWithoutMock() {
        // Arrange: Assuming you have some test data in your repository
        Etudiant etudiant1 = new Etudiant("John", "Doe");
        Etudiant etudiant2 = new Etudiant("Jane", "Smith");

        etudiantRepository.save(etudiant1);
        etudiantRepository.save(etudiant2);

        // Act
        List<Etudiant> retrievedEtudiants = etudiantService.retrieveAllEtudiants();

        // Assert
        assertEquals(2, retrievedEtudiants.size());
    }




}
