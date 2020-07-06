package com.infosys.streamset.orchestrator.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Topology {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private Topology() {
		// Empty constructor required as of Neo4j API 2.0.5
	};

	public Topology(String name) {
		this.name = name;
	}

}
