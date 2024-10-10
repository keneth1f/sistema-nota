package com.example.demo.service;

@Service
public class NotaService {
    @Autowired
    private NotaRepository notaRepository;
    
    public List<Nota> obtenerNotas() {
        return notaRepository.findAll();
    }
    
    public Nota guardarNota(Nota nota) {
        return notaRepository.save(nota);
    }
    
    public void eliminarNota(Long id) {
        notaRepository.deleteById(id);
    }
    
    public Nota actualizarNota(Long id, Nota nuevaNota) {
        Nota notaExistente = notaRepository.findById(id).orElseThrow();
        notaExistente.setActividades(nuevaNota.getActividades());
        notaExistente.setPrimerParcial(nuevaNota.getPrimerParcial());
        notaExistente.setSegundoParcial(nuevaNota.getSegundoParcial());
        notaExistente.setExamenFinal(nuevaNota.getExamenFinal());
        return notaRepository.save(notaExistente);
    }
}