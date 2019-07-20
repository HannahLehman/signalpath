const program = require('commander');
const { hexToBase } = require('./commands');

program
  .version('0.0.1')
  .description('Command line Hex-To-Base Utility');

program
  .command("convert <hexString>")
  .alias('c')
  .description('see the base64 conversion of the supplied hexadecimal string')
  .action(hexString => hexToBase(hexString));

program.parse(process.argv);
