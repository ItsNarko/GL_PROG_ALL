document.addEventListener('DOMContentLoaded', function() {
    fetch('courses.json')
        .then(response => response.json())
        .then(courses => populateSchedule(courses));
});

function populateSchedule(courses) {
    const days = ['mon', 'tue', 'wed', 'thu', 'fri']; // Adjust according to actual days
    courses.forEach(course => {
        if (course.timeslots) {
            course.timeslots.forEach(slot => {
                const day = days[slot[0] - 1]; // Adjust day index to match your days array
                const hour = slot[1];
                const cellId = `${day}${hour}`;
                const cell = document.getElementById(cellId);
                if (cell) {
                    cell.style.backgroundColor = course.color;
                    cell.innerHTML = `<strong>${course.course}</strong><br>${course.title}<br>${course.instructor}<br>${course.room}`;
                    // Store data attributes for use in click events, etc.
                    cell.dataset.description = course.description;
                }
            });
        }
    });
}

document.querySelectorAll('#schedule td').forEach(cell => {
    cell.addEventListener('mouseover', () => {
        cell.classList.add('highlight'); // Adds highlight on hover
    });
    cell.addEventListener('mouseout', () => {
        cell.classList.remove('highlight'); // Removes highlight when not hovering
    });
    cell.addEventListener('click', () => {
        if (cell.dataset.description) {
            alert(`Course Info:\n${cell.innerHTML}\nDescription: ${cell.dataset.description}`);
        }
    });
});

document.addEventListener('DOMContentLoaded', function() {
    const addCourseBtn = document.getElementById('addCourseBtn');
    const saveCourseBtn = document.getElementById('saveCourseBtn');
    const courseSelect = document.getElementById('courseSelect');
    let courses = [];

    fetch('courses.json')
        .then(response => response.json())
        .then(data => {
            courses = data;
            populateCourseSelect(courses);
        });

    addCourseBtn.addEventListener('click', () => {
        document.getElementById('courseForm').reset();
        document.getElementById('courseModalLabel').textContent = 'Add New Course';
    });

    saveCourseBtn.addEventListener('click', () => {
        // Logic to save or update course details
        // Validate form, collect data, send it to the server or local storage
    });

    courseSelect.addEventListener('change', () => {
        const selectedCourse = courses.find(course => course.id === parseInt(courseSelect.value));
        document.getElementById('courseName').value = selectedCourse.course;
        document.getElementById('courseColor').value = selectedCourse.color;
        // Update other form fields as necessary
    });

    function populateCourseSelect(courses) {
        courses.forEach(course => {
            const option = new Option(course.course, course.id);
            courseSelect.add(option);
        });
    }
});
