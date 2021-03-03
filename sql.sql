create table medium (
    id INT primary key AUTO_INCREMENT,
    elnevezes VARCHAR(20),
    musorido INT,
    kozszolgalati VARCHAR(4),
    elofizeteses VARCHAR(4)
)

INSERT INTO medium (elnevezes, musorido, kozszolgalati, elofizeteses) VALUES
('KirályiEgyes', 1440, 'igen', 'nem'),
('ReklámTV', 1000, 'nem', 'nem'),
('AmásikOldal', 1200, 'igen', 'igen')
