<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Happy Birthday!</title>
    <style>
        /* General Page Styling */
        body {
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: radial-gradient(circle, #ff9a9e 0%, #fad0c4 99%, #fad0c4 100%);
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            overflow: hidden;
            text-align: center;
        }

        /* Container for the content */
        .card {
            background: white;
            padding: 40px;
            border-radius: 20px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);
            z-index: 10;
            max-width: 400px;
        }

        h1 {
            color: #ff4d6d;
            font-size: 2.5rem;
            margin-bottom: 10px;
            animation: bounce 2s infinite;
        }

        p {
            color: #555;
            font-size: 1.1rem;
            line-height: 1.6;
        }

        .btn {
            background-color: #ff4d6d;
            color: white;
            border: none;
            padding: 12px 24px;
            border-radius: 25px;
            font-size: 1rem;
            cursor: pointer;
            transition: transform 0.3s ease;
            margin-top: 20px;
        }

        .btn:hover {
            transform: scale(1.1);
            background-color: #ff1a4a;
        }

        /* Animation for the title */
        @keyframes bounce {
            0%, 100% { transform: translateY(0); }
            50% { transform: translateY(-10px); }
        }

        /* Confetti Styling */
        .confetti {
            position: absolute;
            width: 10px;
            height: 10px;
            background-color: #f2d74e;
            top: -10px;
            z-index: 1;
        }
    </style>
</head>
<body>

    <div class="card">
        <h1>🎉 Happy Birthday! 🎂</h1>
        <p>Wishing you a day filled with happiness, a year filled with joy, and a life filled with love.</p>
        <p><strong>Enjoy your special day!</strong></p>
        <button class="btn" onclick="celebrate()">Click for a Surprise!</button>
    </div>

    <script>
        function celebrate() {
            // Simple confetti effect
            for (let i = 0; i < 100; i++) {
                const confetti = document.createElement('div');
                confetti.className = 'confetti';
                confetti.style.left = Math.random() * 100 + 'vw';
                confetti.style.backgroundColor = hsl(${Math.random() * 360}, 70%, 60%);
                confetti.style.transform = rotate(${Math.random() * 360}deg);
                
                document.body.appendChild(confetti);

                // Animate falling
                const animation = confetti.animate([
                    { top: '-10px', opacity: 1 },
                    { top: '100vh', opacity: 0 }
                ], {
                    duration: Math.random() * 3000 + 2000,
                    easing: 'linear'
                });

                animation.onfinish = () => confetti.remove();
            }
        }
    </script>
</body>
</html>