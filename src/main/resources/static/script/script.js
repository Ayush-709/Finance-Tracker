document.addEventListener("DOMContentLoaded", () => {
    const hamburgerMenu = document.querySelector(".hamburger-menu");
    const navLinks = document.querySelector(".nav-links");

    hamburgerMenu.addEventListener("click", () => {
        hamburgerMenu.classList.toggle("open");
        navLinks.classList.toggle("open");
    });

    // Optional: Close the menu if a link is clicked
    const links = document.querySelectorAll(".nav-links a");
    links.forEach((link) => {
        link.addEventListener("click", () => {
            hamburgerMenu.classList.remove("open");
            navLinks.classList.remove("open");
        });
    });
});
