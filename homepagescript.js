function isScrolledToBottom() {
    // Check if the user has scrolled to the bottom
    return window.innerHeight + window.scrollY >= document.body.offsetHeight;
  }

  function animateOnScroll() {
    if (isScrolledToBottom()) {
      // If scrolled to the bottom, add class to trigger animation for each element
      var animateElements = document.querySelectorAll('.animate');
      animateElements.forEach(function(element) {
        element.classList.add('fade-in');
      });
    }
  }

  function scrollToBottom() {
    // Scroll to the bottom of the page
    window.scrollTo({ top: document.body.scrollHeight, behavior: 'smooth' });
  }

  // Event listener for scrolling
  window.addEventListener('scroll', animateOnScroll);
  window.addEventListener('scroll', function() {
var scrollBtn = document.getElementById('scrollBtn');
if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
  scrollBtn.style.display = 'block';
} else {
  scrollBtn.style.display = 'none';
}
});

function scrollToTop() {
if (document.body.scrollTop > 0 || document.documentElement.scrollTop > 0) {
  window.scrollTo({ top: 0, behavior: 'smooth' });
}
}