

-- Supprime le schéma projet

DROP SCHEMA IF EXISTS projet CASCADE;


-- Crée l'utilisateur projet
-- (après l'avoir supprimé au préalable s'il existait déjà)

DO $code$
BEGIN
	IF EXISTS (SELECT  FROM pg_catalog.pg_roles WHERE rolname  = 'projet')
	THEN
		REVOKE CREATE ON DATABASE postgres FROM projet;
		DROP USER projet;
	END IF;
END
$code$;

CREATE USER projet WITH PASSWORD 'projet';
GRANT CREATE ON DATABASE postgres TO projet;

