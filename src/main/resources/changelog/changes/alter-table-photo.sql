ALTER TABLE photo
ALTER COLUMN file TYPE BYTEA USING file::bytea;