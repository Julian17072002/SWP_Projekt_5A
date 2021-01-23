
use dartdb;

drop table fivezeroone;

/*CREATE TABLE fivezeroone (
*	dt DATETIME DEFAULT CURRENT_TIMESTAMP PRIMARY KEY,
*	score float(10),
*	avg float(10),
*	doppelquote float(10)
*); 
*/
CREATE TABLE fivezeroone (
	dt DATETIME PRIMARY KEY,
	score float(10),
	avg float(10),
	doppelquote float(10)
); 

