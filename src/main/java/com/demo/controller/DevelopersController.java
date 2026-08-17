package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevelopersController {

    @GetMapping(value = "/developer1", produces = "text/html")
    public String developer1Page() {

        return """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>Developer 1</title>
                    <style>
                        body {
                            font-family: Arial, sans-serif;
                            background: #f3e5f5;
                            text-align: center;
                            padding: 50px;
                        }

                        .card {
                            background: white;
                            padding: 40px;
                            border-radius: 20px;
                            max-width: 650px;
                            margin: auto;
                            box-shadow: 0 5px 20px rgba(0,0,0,0.2);
                        }

                        h1 {
                            color: #7b1fa2;
                        }

                        .emoji {
                            font-size: 70px;
                        }

                        .shayari {
                            font-size: 20px;
                            font-style: italic;
                            line-height: 1.7;
                            color: #444;
                        }

                        .success {
                            color: green;
                            font-weight: bold;
                        }
                    </style>
                </head>

                <body>

                    <div class="card">

                        <div class="emoji">👨‍💻☕</div>

                        <h1>Developer 1</h1>

                        <p class="shayari">
                            "Code likha tha simple sa,<br>
                            Bug ne bana diya emotional sa. 😅<br>
                            Fix karte-karte raat ho gayi,<br>
                            Fir bhi developer ki smile nahi gayi! 😂"
                        </p>

                        <hr>

                        <p>
                            Welcome to Developer 1 API
                        </p>

                        <p class="success">
                            ✅ API is working successfully!
                        </p>

                    </div>

                </body>
                </html>
                """;
    }

    @GetMapping(value = "/developer2", produces = "text/html")
    public String developer2Page() {

        return """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>Developer 2</title>
                    <style>
                        body {
                            font-family: Arial, sans-serif;
                            background: #e3f2fd;
                            text-align: center;
                            padding: 50px;
                        }

                        .card {
                            background: white;
                            padding: 40px;
                            border-radius: 20px;
                            max-width: 650px;
                            margin: auto;
                            box-shadow: 0 5px 20px rgba(0,0,0,0.2);
                        }

                        h1 {
                            color: #1565c0;
                        }

                        .emoji {
                            font-size: 70px;
                        }

                        .shayari {
                            font-size: 20px;
                            font-style: italic;
                            line-height: 1.7;
                            color: #444;
                        }

                        .success {
                            color: green;
                            font-weight: bold;
                        }
                    </style>
                </head>

                <body>

                    <div class="card">

                        <div class="emoji">💻😂</div>

                        <h1>Developer 2</h1>

                        <p class="shayari">
                            "Git push केला मोठ्या style मध्ये,<br>
                            CI pipeline आली full speed मध्ये. 🚀<br>
                            Build झाली तर developer खुश,<br>
                            Error आला तर म्हणतो — 'Laptop चाच दोष!' 😂"
                        </p>

                        <hr>

                        <p>
                            Welcome to Developer 2 API
                        </p>

                        <p class="success">
                            ✅ API is working successfully!
                        </p>

                    </div>

                </body>
                </html>
                """;
    }
}