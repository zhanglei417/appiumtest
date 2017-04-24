/* eslint-disable no-console */
"use strict";

var exec = require("child_process").exec;
var path = require("path");

var MAX_ATTEMPTS = 5;
var INTERVAL = 1500;
var attempts = 1;
var attemptedToBuild = false;

function doInstall () {

}

if (require.main === module) {
  doInstall();
}
