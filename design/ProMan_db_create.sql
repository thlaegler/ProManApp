CREATE TABLE relationshiptype (
  relationshipTypeId INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  name TINYTEXT NULL,
  PRIMARY KEY(relationshipTypeId)
);

INSERT INTO relationshiptype (name) VALUES ('is-a');
INSERT INTO relationshiptype (name) VALUES ('has-a');
INSERT INTO relationshiptype (name) VALUES ('owns-a');
INSERT INTO relationshiptype (name) VALUES ('uses-a');


CREATE TABLE itemtype (
  itemTypeId INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  name TINYTEXT NULL,
  PRIMARY KEY(itemTypeId)
);

INSERT INTO itemtype (name) VALUES ('person');
INSERT INTO itemtype (name) VALUES ('software');
INSERT INTO itemtype (name) VALUES ('process');


CREATE TABLE item (
  itemId INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  itemTypeId INTEGER UNSIGNED NOT NULL,
  name TINYTEXT NULL,
  description TINYTEXT NULL,
  isActive BOOL NULL,
  PRIMARY KEY(itemId),
  INDEX itemItemTypIndex(itemTypeId),
  FOREIGN KEY(itemTypeId)
    REFERENCES itemtype(ItemTypeId)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

INSERT INTO item (itemId, itemTypeId, name) VALUES (1, 1, 'Peter');
INSERT INTO item (itemId, itemTypeId, name) VALUES (2, 1, 'Otto');
INSERT INTO item (itemId, itemTypeId, name) VALUES (3, 1, 'Eugen');


CREATE TABLE person (
  domainId INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  itemId INTEGER UNSIGNED NOT NULL,
  eMail TINYTEXT NULL,
  PRIMARY KEY(domainId),
  INDEX personItemIndex(itemId),
  FOREIGN KEY(itemId)
    REFERENCES item(itemId)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

INSERT INTO person (itemId, eMail) VALUES (1, 'peter@test.de'); 
INSERT INTO person (itemId, eMail) VALUES (2, 'otto@test.de'); 
INSERT INTO person (itemId, eMail) VALUES (3, 'eugen@test.de'); 


CREATE TABLE relationship (
  firstItemId INTEGER UNSIGNED NOT NULL,
  secondItemId INTEGER UNSIGNED NOT NULL,
  fourthItemId INTEGER UNSIGNED NOT NULL,
  thirditemId INTEGER UNSIGNED NOT NULL,
  relationshipTypeId INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(firstItemId, secondItemId),
  INDEX Item_has_Item_FKIndex1(firstItemId),
  INDEX Item_has_Item_FKIndex2(secondItemId),
  INDEX relationshipRelationshiptype(relationshipTypeId),
  INDEX Relationship_FKIndex5(fourthItemId),
  FOREIGN KEY(firstItemId)
    REFERENCES item(itemId)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(secondItemId)
    REFERENCES item(itemId)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(relationshipTypeId)
    REFERENCES relationshiptype(relationshipTypeId)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(thirdItemId)
    REFERENCES item(itemId)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(fourthItemId)
    REFERENCES item(itemId)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE software (
  domainId INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  itemId INTEGER UNSIGNED NOT NULL,
  manufacturer TINYTEXT NULL,
  PRIMARY KEY(domainId),
  INDEX softwareItemIndex(itemId),
  FOREIGN KEY(itemId)
    REFERENCES item(itemId)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);


