LTI Demo
========

This is a small example spring LTI webapp that does the bare minimum to handle a LTI launch and display back a web page. This uses the `lti-launch` library that does most of the heavy lifting of validating the LTI launch and setting up a session. The tool is a single controller with a JSP to render the output.

Build
-----

[![Build Status](https://travis-ci.org/ox-it/lti-demo.svg?branch=master)](https://travis-ci.org/ox-it/lti-demo)

Configuration
-------------

There are a few configuration options to setup the tool provider:

```properties
# The LTI key for the launch (default: consumer)
lti.instance=canvas
# The LTI secret for the launch, which in production must be secure (default: secret)
lti.secret=canvas
# The name of the application (default: LTI Demo)
lti.name=Example LTI Demo
# The URL of the tool consumer (default: http://example.com)
# This only used when checking service sending request, which is not enabled by default.
lti.url=http://canvas.instructure.com
```

Building
--------

To build this use maven or the maven wrapper.
```bash
mvn install
```
or
```bash
./mvnw install
```

Running
-------

Having built the code it can be run, you can also pass in configuration if you haven't edited the config in the source:

```bash
java -jar target/lti-demo-0.0.1-SNAPSHOT.war \
  --lti.instance=canvas \
  --lti.secret=canvas \
  --lti.name="Example LTI Demo" \
  --lti.url=http://canvas.instructure.com
```


Installation in Canvas
----------------------

To install this tool into Canvas there is a snippet of XML that can be edited to paste into the tool configuration when adding a LTI tool that makes the tool appear on the course navigation. It's in the file `lti.xml`, you may need to change the launch URL to the actual URL you are using.



