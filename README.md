Fluiding rules that are easy to define and understand
Rule definitions define expected behaviour and act as live document
No/ minimal learning curve
Ease of extending logical conditions, operators and statements.
UI editor with content-assist
Hooks for integrating with QuickFIXJ/ firm-specific data dictionary
Embeddable in your existing applications

```sh
tag(11) must be             present;
tag(32) must be             greater than 0;
tag(39) must be             valid;
tag(60) ~=                  "[0-9]{8}-[0-9]{2}:[0-9]{2}:[0-9]{2}.[0-9]{3}";
tag(201) must be in         0,1 if tag(167) = "OPT";
tag(29) must        be unique;
tag(55)             must be consistent;
tag(59) must be equal to 1;
tag(10206) = tag(11) + tag(37) + tag(1207);
```