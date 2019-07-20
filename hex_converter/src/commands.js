const hexToBase = (hexString) => {
  const baseString = Buffer.from(hexString, 'hex').toString('base64');

  console.log(baseString);
};

module.exports = {
  hexToBase
};
