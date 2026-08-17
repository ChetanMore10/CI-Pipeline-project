package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Developer1Controller {

    @GetMapping(value = "/developer1", produces = "text/html")
    public String developer1Page() {

        return """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>AutoPark - Developer 1</title>
                    <style>
                        body {
                            font-family: Arial;
                            background: #f0f8ff;
                            text-align: center;
                            padding: 50px;
                        }
                        .card {
                            background: white;
                            padding: 40px;
                            border-radius: 15px;
                            max-width: 600px;
                            margin: auto;
                            box-shadow: 0 5px 20px rgba(0,0,0,0.2);
                        }
                        h1 {
                            color: #1976d2;
                        }
                        .vehicle {
                            font-size: 70px;
                        }
                    </style>
                </head>
                <body>
                    <div class="card">
                        <div class="vehicle">🚗</div>
                        <h1>Welcome to AutoPark</h1>
                        <h2>Developer 1</h2>
                        <p>Vehicle Management Team</p>
                        <p>
                            This page is created by Developer 1
                            for learning CI/CD.
                        </p>
                        <hr>
                        <p>✅ API is working successfully!</p>
                    </div>
                </body>
                </html>
                """;
    }
}