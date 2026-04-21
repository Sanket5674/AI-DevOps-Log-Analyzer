# 🚀 AI DevOps Log Analyzer

AI-powered backend system that analyzes application logs and provides root cause and fix suggestions using OpenAI API.

---

## 🔥 Features

- Analyze application logs
- Detect root cause of errors
- Suggest fixes using AI
- REST API-based backend
- Fallback response handling (resilient system)

---

## 🛠 Tech Stack

- Java
- Spring Boot
- OpenAI API
- REST APIs
- OkHttp

---

## 📡 API Endpoint

POST /api/log/analyze

### Request (Raw Text)


---

## 🧠 How It Works

1. User sends log via API  
2. Backend sends request to OpenAI  
3. AI analyzes error  
4. Returns explanation + fix  
5. If API fails → fallback response is returned  

---

## ⚙️ Setup & Run

1. Install Java (JDK 17+)
2. Clone repo

git clone https://github.com/Sanket5674/AI-DevOps-Log-Analyzer.git

3. Add your OpenAI API key 
4. Run project


---

## 📷 Demo (Postman)

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/41a10ebc-c9b7-4334-912e-fedcbe6e286d" />


---

## 🚀 Future Improvements

- UI dashboard for log analysis  
- Support batch log processing  
- Integration with monitoring tools  

---

## 👨‍💻 Author

Sanket Jaybhaye
