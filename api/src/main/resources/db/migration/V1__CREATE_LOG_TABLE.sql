-- CREATE TYPE statusEnum as ENUM ('SUCCESS', 'FAILED', 'BLOCKED', 'WARNING');

CREATE TABLE logs (
    id SERIAL PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    action VARCHAR(20) NOT NULL,
    -- status statusEnum NOT NULL,
    status VARCHAR(20) NOT NULL,
    date DATE NOT NULL,
    time TIME NOT NULL
);