<?
class person
{
	public $name,$address,$age;
	function__construct($name,$address,$age)
	{
		$this->name=$name;
		$this->address=$address;
		$this->age=$age;
	}
	function getinfo()
	{
		echo"name =".$this->name."</br>";
		echo"address =".$this->address."</br>";
		echo"age =".$this->age."</br>";
	}
}


class employee extends person
{
	public $position ,$salary;
	function__construct($name,$address,$age,$position ,$salary)
	{
		parernt::__construct($name,$address,$age);
		$this->position=$position;
		$this->salary=$salary;
	}

	function getinfo()
	{
		parent::getinfo();
		echo"position =".$this->position."</br>";
		echo"salary =".$this->salary."</br>";
	}
}

$p = new person("ram","pune",29);
echo$p->getinfo();
echo"</br>";
$e=new employee("ritesh","mumbai",30,"manager",40000);
echo $e->getinfo();
?>
	
