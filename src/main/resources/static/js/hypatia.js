document.addEventListener('DOMContentLoaded', function() {
  const signupImage = document.querySelector('.signup-image');
  if (signupImage) {
    const randomNum = Math.floor(Math.random() * 5) + 1;
    const imagePath = '/img/signup/00' + randomNum + '.jpg';
    signupImage.style.backgroundImage = 'url(' + imagePath + ')';
  }
});
