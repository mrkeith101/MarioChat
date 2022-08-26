const clearBtn = document.getElementById('clear-btn');

// When the clearBtn is clicked, make a delete request to the server
clearBtn.addEventListener('click', function(e) {
    fetch('/clearchat', {
        method: 'DELETE'
    })
    .then((data) => {
        console.log(data);
        console.log('Chat cleared');
    })
    .then(() => {
    }).catch(err => console.log(err));
});