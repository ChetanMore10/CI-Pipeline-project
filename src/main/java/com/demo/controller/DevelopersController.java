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

    @GetMapping(value = "/developer3", produces = "text/html")
    public String developer3Page() {

        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Developer 3</title>

                <style>
                    body {
                        font-family: Arial, sans-serif;
                        background: linear-gradient(135deg, #fce4ec, #e1bee7);
                        text-align: center;
                        padding: 50px;
                    }

                    .card {
                        background: white;
                        padding: 45px;
                        border-radius: 25px;
                        max-width: 650px;
                        margin: auto;
                        box-shadow: 0 10px 30px rgba(0,0,0,0.2);
                    }

                    .emoji {
                        font-size: 70px;
                    }

                    h1 {
                        color: #c2185b;
                        font-size: 36px;
                    }

                    h2 {
                        color: #7b1fa2;
                    }

                    .shayari {
                        font-size: 21px;
                        line-height: 1.8;
                        color: #444;
                        font-style: italic;
                    }

                    .highlight {
                        color: #c2185b;
                        font-weight: bold;
                    }

                    .success {
                        color: #2e7d32;
                        font-weight: bold;
                        font-size: 18px;
                    }
                </style>
            </head>

            <body>

                <div class="card">

                    <div class="emoji">👨‍💻❤️☕</div>

                    <h1>Developer 3</h1>

                    <h2>Code • Coffee • Confidence 😎</h2>

                    <p class="shayari">

                        "Code मध्ये bugs असले तरी चालतील,<br>
                        पण <span class="highlight">तुझ्या smile मध्ये bugs नसावेत! 😉</span>
                        <br><br>

                        Git push करतो रोज,<br>
                        पण तुझ्या reply ची वाट पाहतो रोज. 😄<br>

                        CI म्हणते — Build Successful! ✅<br>
                        आणि मन म्हणतं — <span class="highlight">She is Beautiful! ❤️</span>

                    </p>

                    <hr>

                    <p>
                        Welcome to Developer 3 API 🚀
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