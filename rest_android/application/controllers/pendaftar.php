<?php
defined('BASEPATH') OR exit('No direct script access allowed');

require APPPATH .'/libraries/Rest_Controller.php';
use Restserver\Libraries\REST_Controller;

class pendaftar extends Rest_Controller{
	
	function __construct($config='rest')
	{
		parent::__construct($config);
		//Do your magic here
		$this->load->database();
	}
	//shpw data mahasiswa
	function index_get() {
		$id_pen = $this->get('id_pen');
		if ($id_pen=='') {
			# code...
			$pendaftar=$this->db->get('pendaftar')->result();
		} else {
			$this->db->where('id_pen', $id_pen);
			$pendaftar = $this->db->get('pendaftar')->result();
		}
		$this->response(array('result' =>$pendaftar, 200));
	}

	//insert new data
	function index_post(){
		$data = array(
			'id_pen' => $this->post('id_pen'),
			'nama' => $this->post('nama'),
			'alamat' => $this->post('alamat'),
			'ttl' => $this->post('ttl') );
		$insert = $this->db->insert('pendaftar', $data);
		if ($insert) {
			# code...
			$this->response(array('result' =>$data, 200));
		} else {
			$this->response(array('status' =>'fail', 502));
		}
	}

	//update data
	function index_put(){
		$id_pen = $this->put('id_pen');
		$data = array(
			'id_pen' => $this->put('id_pen'),
			'nama' => $this->put('nama'),
			'alamat' => $this->put('alamat'),
			'ttl' => $this->put('ttl'));
		$this->db->where('id_pen', $id_pen);
		$update = $this->db->update('pendaftar', $data);
		if($update){
			$this->response($data, 200);
		} else{
			$this->response(array('status' => 'fail', 502));
		}
	}

	//delete data
	function index_delete(){
		$id_pen = $this->delete('id_pen');
		$this->db->where('id_pen', $id_pen);
		$delete = $this->db->delete('pendaftar');
		if ($delete) {
			# code...
			$this->response(array('status' => 'success'),201);
		} else {
			$this->response(array('status' => 'fail', 502));
		}
	}
}
?>