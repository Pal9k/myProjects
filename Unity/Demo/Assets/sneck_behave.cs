using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class sneck_behave : MonoBehaviour {

	public float speed = 1.0f;
	private int left=1;
	private int right=0;
	private int up=0;
	private int down=0;
	

	public void OnCollisionEnter2D(Collision2D call){
		if(call.gameObject.name=="wall" ^ call.gameObject.name=="wall1" ^ call.gameObject.name=="wall2" ^call.gameObject.name=="wall3")
			Destroy(gameObject);
	}

	void Update () {
		
		if(Input.GetAxis("Horizontal")>0)
		{
			right=1;
			if(left==1)
			{
				transform.Rotate(0,0,180);
				left=0;
			}
			if(up==1)
			{
				transform.Rotate(0,0,-90);
				up=0;
			}
			if(down==1)
			{
				transform.Rotate(0,0,90);
				down=0;
			}
		}
		if(Input.GetAxis("Horizontal")<0)
		{
			left=1;
			if(right==1)
			{
				transform.Rotate(0,0,180);
				right=0;
			}
			if(up==1)
			{
				transform.Rotate(0,0,90);
				up=0;
			}
			if(down==1)
			{
				transform.Rotate(0,0,-90);
				down=0;
			}
		}
		if(Input.GetAxis("Vertical")>0) 
		{
			up=1;
			if(right==1)
			{
				transform.Rotate(0,0,90);
				right=0;
			}
			if(left==1)
			{
				transform.Rotate(0,0,-90);
				left=0;
			}
			if(down==1)
			{
				transform.Rotate(0,0,180);
				down=0;
			}
		}
		if(Input.GetAxis("Vertical")<0)
		{
			down=1;
			if(right==1)
			{
				transform.Rotate(0,0,-90);
				right=0;
			}
			if(left==1)
			{
				transform.Rotate(0,0,90);
				left=0;
			}
			if(up==1)
			{
				transform.Rotate(0,0,180);
				up=0;
			}
		}
		

		if(up==1)
		{
			transform.Translate(Vector2.down*speed*Time.deltaTime);	
		}
		else if(down==1)
		{
			transform.Translate(Vector2.down*speed*Time.deltaTime);	
		}
		else if(left==1)
		{
			transform.Translate(Vector2.down*speed*Time.deltaTime);	
		}	
		else if(right==1)
		{
			transform.Translate(Vector2.down*speed*Time.deltaTime);	
		}


	}
}
