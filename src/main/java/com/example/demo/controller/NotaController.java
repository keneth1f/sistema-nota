package com.example.demo.controller;

@RestController
@RequestMapping("/api/notas")
@CrossOrigin("*")
public class NotaController {
    @Autowired
    private NotaService notaService;

    @GetMapping
    public List<Nota> listarNotas() {
        return notaService.obtenerNotas();
    }

    @PostMapping
    public Nota crearNota(@RequestBody Nota nota) {
        return notaService.guardarNota(nota);
    }

    @PutMapping("/{id}")
    public Nota actualizarNota(@PathVariable Long id, @RequestBody Nota nota) {
        return notaService.actualizarNota(id, nota);
    }

    @DeleteMapping("/{id}")
    public void eliminarNota(@PathVariable Long id) {
        notaService.eliminarNota(id);
    }
}
