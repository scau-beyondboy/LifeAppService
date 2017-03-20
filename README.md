{
	"variables": [],
	"info": {
		"name": "lifeapp",
		"_postman_id": "1c905aaf-aaea-9cef-0576-22853f6b2706",
		"description": "lifeapp测试接口文档",
		"schema": "https://schema.getpostman.com/json/collection/v2.0.0/collection.json"
	},
	"item": [
		{
			"name": "http://localhost:8080/user/register",
			"request": {
				"url": "http://localhost:8080/user/register",
				"method": "POST",
				"header": [
					{
						"key": "Content-Type",
						"value": "application/json",
						"description": ""
					}
				],
				"body": {
					"mode": "raw",
					"raw": "{\n   \"userPassword\":\"123456\",\n   \"userNickname\":\"test6\",\n   \"userAvatar\":\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW_KGKOiRg0oTNHgrCNCp4vyjHXQB0GhEAfqWLB3Yupf5LT36v3pPdqw\",\n   \"userSex\":1\n}"
				},
				"description": " 注册用户  "
			},
			"response": []
		},
		{
			"name": "http://localhost:8080/user/login",
			"request": {
				"url": "http://localhost:8080/user/login",
				"method": "POST",
				"header": [
					{
						"key": "Content-Type",
						"value": "application/json",
						"description": ""
					}
				],
				"body": {
					"mode": "raw",
					"raw": "{\n   \"password\":\"123456\",\n   \"nickname\":\"test6\"\n}"
				},
				"description": " 用户登录"
			},
			"response": []
		},
		{
			"name": "http://localhost:8080/club/addInfo",
			"request": {
				"url": "http://localhost:8080/club/addInfo",
				"method": "POST",
				"header": [
					{
						"key": "Content-Type",
						"value": "application/json",
						"description": ""
					}
				],
				"body": {
					"mode": "raw",
					"raw": "{\n\t \"clubName\":\"fjal\",\n\t \"clubLogo\":\"fjsda\",\n\t \"clubWebsite\":\"fjka\",\n\t \"clubWeixinNum\":\"fjak\",\n\t \"clubDesc\":\"fjksad\"\n}"
				},
				"description": " 添加 "
			},
			"response": []
		},
		{
			"name": "http://localhost:8080/club/getList",
			"request": {
				"url": "http://localhost:8080/club/getList",
				"method": "POST",
				"header": [
					{
						"key": "Content-Type",
						"value": "application/json",
						"description": ""
					}
				],
				"body": {
					"mode": "raw",
					"raw": "{\n\t\"pageaccount\":1,\n\t\"pagesize\":5\n}"
				},
				"description": "分页获取社团信息"
			},
			"response": []
		},
		{
			"name": "http://localhost:8080/user/info",
			"request": {
				"url": "http://localhost:8080/user/info",
				"method": "POST",
				"header": [
					{
						"key": "Content-Type",
						"value": "application/json",
						"description": ""
					}
				],
				"body": {
					"mode": "raw",
					"raw": "{\n\t\"userId\":3,\n\t\"userNum\":201330340625,\n\t\"userIden\":1,\n\t\"userMajor\":\"软件工程\",\n\t\"userGradle\":\"大一\",\n\t\"userClass\":\"R6\"\n}"
				},
				"description": "上传或用户信息。"
			},
			"response": []
		},
		{
			"name": "http://localhost:8080/user/getInfo",
			"request": {
				"url": "http://localhost:8080/user/info",
				"method": "POST",
				"header": [
					{
						"key": "Content-Type",
						"value": "application/json",
						"description": ""
					}
				],
				"body": {
					"mode": "raw",
					"raw": "{\n\t\"userId\":3\n}"
				},
				"description": "get UserDetial"
			},
			"response": []
		},
		{
			"name": "http://localhost:8080/club/getTotal",
			"request": {
				"url": "http://localhost:8080/club/getTotal",
				"method": "POST",
				"header": [
					{
						"key": "Content-Type",
						"value": "application/json",
						"description": ""
					}
				],
				"body": {
					"mode": "raw",
					"raw": ""
				},
				"description": " 获取 "
			},
			"response": []
		},
		{
			"name": "http://localhost:8080/notice/getList",
			"request": {
				"url": "http://localhost:8080/notice/getList",
				"method": "POST",
				"header": [
					{
						"key": "Content-Type",
						"value": "application/json",
						"description": ""
					}
				],
				"body": {
					"mode": "raw",
					"raw": "{\n\t\"pagestart\":0,\n\t\"pagesize\":5\n}"
				},
				"description": " 获取 "
			},
			"response": []
		},
		{
			"name": "http://localhost:8080/lost/add",
			"request": {
				"url": "http://localhost:8080/lost/add",
				"method": "POST",
				"header": [
					{
						"key": "Content-Type",
						"value": "application/json",
						"description": ""
					}
				],
				"body": {
					"mode": "raw",
					"raw": "{\n\t\"lostImage\":\"haha\",\n\t\"lostOwner\":\"guoli\",\n\t\"lostPhone\":\"188843434\",\n\t\"lostCardNum\":\"2013303024050\",\n\t\"lostDesc\":\"huo'qu获取wu'pin\",\n\t\"lostDate\":\"2016-12-26\"\n}"
				},
				"description": "获取 获取添加 获取添加失误 "
			},
			"response": []
		},
		{
			"name": "http://localhost:8080/pickup/add",
			"request": {
				"url": "http://localhost:8080/pickup/add",
				"method": "POST",
				"header": [
					{
						"key": "Content-Type",
						"value": "application/json",
						"description": ""
					}
				],
				"body": {
					"mode": "raw",
					"raw": "{\n\t\"pickupImage\":\"haha\",\n\t\"pickupPhone\":\"188843434\",\n\t\"pickupCardNum\":\"2013303024050\",\n\t\"pickupDesc\":\"huo'qu获取wu'pin\",\n\t\"pickupDate\":\"2016-12-26\"\n}"
				},
				"description": "获取 获取添加 获取添加失误 "
			},
			"response": []
		},
		{
			"name": "http://localhost:8080/user/update",
			"request": {
				"url": "http://localhost:8080/user/update",
				"method": "POST",
				"header": [
					{
						"key": "Content-Type",
						"value": "application/json",
						"description": ""
					}
				],
				"body": {
					"mode": "raw",
					"raw": "{\n\t\"userId\":3,\n\t\"userNum\":201330340625,\n\t\"userIden\":1,\n\t\"userMajor\":\"软件工程\",\n\t\"userGradle\":\"l二dfjs\",\n\t\"userClass\":\"R6\"\n}"
				},
				"description": "上传或用户信息。"
			},
			"response": []
		},
		{
			"name": "http://localhost:8080/pickup/getList",
			"request": {
				"url": "http://localhost:8080/pickup/getList",
				"method": "POST",
				"header": [
					{
						"key": "Content-Type",
						"value": "application/json",
						"description": ""
					}
				],
				"body": {
					"mode": "raw",
					"raw": "{\n\t\"pagestart\":0,\n\t\"pagesize\":5\n}"
				},
				"description": " 获取 "
			},
			"response": []
		},
		{
			"name": "http://localhost:8080/pickup/getTotal",
			"request": {
				"url": "http://localhost:8080/club/getTotal",
				"method": "POST",
				"header": [
					{
						"key": "Content-Type",
						"value": "application/json",
						"description": ""
					}
				],
				"body": {
					"mode": "raw",
					"raw": ""
				},
				"description": " 获取 "
			},
			"response": []
		}
	]
}