package io.skaihen.ejercicio1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.skaihen.ejercicio1.models.Curso;
import io.skaihen.ejercicio1.repositories.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {
    @Autowired
    CursoRepository cursoRepository;

    /**
     * The function "cursos()" returns a list of all courses.
     *
     * @return A List of Curso objects is being returned.
     */
    @Override
    public List<Curso> cursos() {
        return cursoRepository.findAll();
    }

    /**
     * The function "buscarCurso" searches for a course with a given course code and
     * returns it, or returns
     * null if no course is found.
     *
     * @param codCurso The parameter "codCurso" is an integer that represents the
     *                 code of the course that
     *                 you want to search for.
     * @return The method is returning an instance of the "Curso" class.
     */
    @Override
    public Curso buscarCurso(int codCurso) {
        return cursoRepository.findById(codCurso).orElse(null);
    }

    /**
     * The function `altaCurso` saves a new course to the database and returns a
     * list of all courses.
     *
     * @param curso The parameter "curso" is an object of type "Curso" which
     *              represents a course.
     * @return The method `altaCurso` returns a list of `Curso` objects.
     */
    @Override
    public List<Curso> altaCurso(Curso curso) {
        cursoRepository.save(curso);
        return cursoRepository.findAll();
    }

    /**
     * The function `actualizarCurso` updates a course in the database by saving the
     * changes made to the
     * `curso` object.
     *
     * @param curso The "curso" parameter is an object of type "Curso" that
     *              represents a course.
     */
    @Override
    public void actualizarCurso(Curso curso) {
        cursoRepository.save(curso);
    }

    /**
     * The function `eliminarCurso` deletes a course with a given course code and
     * returns a list of all
     * remaining courses.
     *
     * @param codCurso The parameter "codCurso" is an integer that represents the
     *                 code of the course that
     *                 needs to be deleted.
     * @return The method is returning a List of Curso objects.
     */
    @Override
    public List<Curso> eliminarCurso(int codCurso) {
        cursoRepository.deleteById(codCurso);
        return cursoRepository.findAll();
    }

    /**
     * The function searches for courses within a specified price range.
     *
     * @param hpMin The minimum price of the course that you want to search for.
     * @param hpMax The maximum price of the courses to search for.
     * @return The method is returning a List of Curso objects.
     */
    @Override
    public List<Curso> buscarCursoEntrePrecioMinMax(double hpMin, double hpMax) {
        return cursoRepository.findAllBetweenPriceMinMax(hpMin, hpMax);
    }
}
