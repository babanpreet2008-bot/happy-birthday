document.getElementById('wishForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const name = document.getElementById('name').value;
    const wishes = [
        `Happy Birthday, ${name}! May your day be filled with joy and laughter.`,
        `Wishing you a fantastic birthday, ${name}! Here's to another year of amazing adventures.`,
        `Cheers to you, ${name}! May this birthday bring you all the happiness you deserve.`,
        `Happy Birthday, ${name}! May all your dreams come true this year.`,
        `To ${name}, on your special day: May it be as wonderful as you are!`
    ];
    const randomWish = wishes[Math.floor(Math.random() * wishes.length)];
    document.getElementById('wishText').textContent = randomWish;
    document.getElementById('wishDisplay').classList.remove('hidden');
});
