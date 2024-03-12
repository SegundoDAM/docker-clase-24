CREATE DATABASE escuela;
CREATE TABLE IF NOT EXISTS curso_escuela (
    id_curso INT PRIMARY KEY AUTO_INCREMENT,
    nivel_curso INT
);
CREATE TABLE estudiante_escolar (
    id_estudiante INT PRIMARY KEY AUTO_INCREMENT,
    nombre_estudiante VARCHAR(55),
    apellidoUno_estudiante VARCHAR(55),
    apellidoDos_estudiante VARCHAR(55),
    curso_id INT,
    FOREIGN KEY (curso_id) REFERENCES curso_escuela(id_curso)
);
CREATE TABLE actividad_escolar (
    id_actividad INT PRIMARY KEY AUTO_INCREMENT,
    descripcion_actividad VARCHAR(55),
    fecha_celebracion DATE
);
CREATE TABLE estudiante_actividad_escolar(
    id_estudiante INT,
    id_actividad INT,
    PRIMARY KEY (id_estudiante,id_actividad),
    Foreign Key (id_estudiante) REFERENCES estudiante_escolar(id_estudiante),
    Foreign Key (id_actividad) REFERENCES actividad_escolar(id_actividad)
);
CREATE TABLE asignatura_escuela (
    id_asignatura INT PRIMARY KEY AUTO_INCREMENT,
    nombre_asignatura VARCHAR(55),
    curso_id INT,
    FOREIGN KEY (curso_id) REFERENCES curso_escuela(id_curso)
);

CREATE TABLE asignatura_estudiante (
    asignatura_id INT,
    estudiante_id INT,
    anno_curso INT,
    nota_final DECIMAL(4,2),
    PRIMARY KEY (asignatura_id, estudiante_id, anno_curso),
    FOREIGN KEY (asignatura_id) REFERENCES asignatura_escuela(id_asignatura),
    FOREIGN KEY (estudiante_id) REFERENCES estudiante_escolar(id_estudiante)
);
INSERT INTO curso_escuela (nivel_curso) VALUES
(1),
(2),
(3);
INSERT INTO asignatura_escuela (nombre_asignatura, curso_id) VALUES
('Matemáticas', 1),
('Lenguaje', 1),
('Ciencias Naturales', 2),
('Historia', 2),
('Inglés', 3);
INSERT INTO estudiante_escolar (nombre_estudiante, apellidoUno_estudiante, apellidoDos_estudiante, curso_id) VALUES
('Juan', 'García', 'Pérez', 1),
('María', 'López', 'Martínez', 2),
('Pedro', 'Fernández', 'González', 3);
INSERT INTO asignatura_estudiante (asignatura_id, estudiante_id, anno_curso, nota_final) VALUES
(1, 1, 2023, 8.5),
(2, 1, 2023, 7.9),
(3, 2, 2023, 9.2),
(4, 2, 2023, 8.7),
(5, 3, 2023, 7.0);