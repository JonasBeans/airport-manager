CREATE TABLE IF NOT EXISTS application.aircraft
(
    callsign character varying(15) NOT NULL,
    model character varying(50) NOT NULL,
    modeltype character varying(50)NOT NULL,
    modelyear character varying(4),
    CONSTRAINT aircraft_pkey PRIMARY KEY (callsign)
)