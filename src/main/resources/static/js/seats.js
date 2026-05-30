document.addEventListener('DOMContentLoaded', () => {
  const priceInput = document.getElementById('seatPrice');
  const selectedSeatText = document.getElementById('selectedSeatText');
  const totalPrice = document.getElementById('totalPrice');
  const price = Number(priceInput?.value || 0);

  function updateSummary() {
    const selected = [...document.querySelectorAll('input[name="selectedSeats"]:checked')].map(input => input.value);
    if (selectedSeatText) selectedSeatText.textContent = selected.length ? selected.join(', ') : 'None';
    if (totalPrice) totalPrice.textContent = (selected.length * price).toFixed(2);
    document.title = selected.length ? `${selected.length} seats selected` : 'Select Seats';
  }

  document.querySelectorAll('input[name="selectedSeats"]').forEach(input => {
    input.addEventListener('change', updateSummary);
  });
  updateSummary();
});
