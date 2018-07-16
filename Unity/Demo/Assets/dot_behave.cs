using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class dot_behave : MonoBehaviour {

	// public Rigidbody2D rdby;

	void OnCollisionEnter2D(Collision2D col)
	{
			// Destroy(col.gameObject);
			if(col.gameObject.name=="sneck")
			transform.position = new Vector2(Random.Range(-10f,11f),Random.Range(-4f,4f));
	}

	void Start()
	{
		transform.position = new Vector2(Random.Range(-10f,11f),Random.Range(-4f,4f));
	}



}
