# permissions-plugin

A working implementation of how to add a custom permission in [Morpheus](https://morpheusdata.com/) under Administration > Roles. This plugin performs the necessary cleanup (implementing the [onDestroy() method](https://developer.morpheusdata.com/api/com/morpheusdata/core/PluginInterface.html#onDestroy())) when it is disabled/removed. 

Useful as a template if you intend to add custom permissions in your plugin code! 

Note: 
- I have only implemented **full** or **none** permissions but you can extend this to **read** too (by implementing [Permission.AccessType.read](https://developer.morpheusdata.com/api/com/morpheusdata/model/Permission.AccessType.html))

**Links:**
- https://developer.morpheusdata.com/api/com/morpheusdata/model/Permission.html
- https://developer.morpheusdata.com/api/index.html
- https://developer.morpheusdata.com/docs

Covered under the [Morpheus Open Source Code Policy](https://support.morpheusdata.com/s/article/Morpheus-Open-Source-Code-Support-Policy?language=en_US)
