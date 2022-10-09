const isCheckboxOrRadio = type => ['checkbox', 'radio'].includes(type);

window.onload = function() {
    const form = document.getElementById('form');
    form.addEventListener('submit', getFormValue);
}

function getFormValue(event) {
    event.preventDefault();

    const fields = document.querySelectorAll('input');
    const values = {};

    fields.forEach(field => {
        const {name, value, type, checked} = field;
        values[name] = isCheckboxOrRadio(type) ? checked : value;
    });

    console.log(values);
}

