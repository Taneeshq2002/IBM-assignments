let currentIndex = 0;

function showSlide(index) {
  const track = document.querySelector(".carousel-track");
  const slides = document.querySelectorAll(".slide");
  const slideWidth = slides[0].offsetWidth;

  if (index >= slides.length) currentIndex = 0;
  else currentIndex = index;

  track.style.transform = `translateX(-${slideWidth * currentIndex}px)`;
}

setInterval(() => {
  showSlide(currentIndex + 1);
}, 7000);

window.onload = () => showSlide(0);
