109
==========================

This is an WinDbg extension designed to help researchers analyze PatchGuard. It allows researchers to derive information of PatchGuard from bugcheck [CRITICAL_STRUCTURE_CORRUPTION (109)](http://msdn.microsoft.com/en-ca/library/windows/hardware/ff557228(v=vs.85).aspx) and a specified address. For more information, see [sample_output.txt](sample_output.txt) and use !help command on WinDbg.

Installation
---------------
1. Start WinDbg (both x86 and x64 are supported)
1. Attach a target kernel or open a crash dump file generated by bugcheck 109.
1. Load the extension by the following command.

    > .load &lt;fullpath to 109&gt;

   If you copied 109.dll into a <WINDBG_DIR>/winext folder, you can omit a path.

    > .load 109

1. Use

   > !dumppg &lt;address&gt;

  when you know an address of a PatchGuard contexts, or use

 > !analyzepg

  when you are facing bugcheck 109, or

  > !help

   to display usage of this extension.

Supported Platforms
-----------------
Host:

- Windows 7 SP1 x64 and later
- x86 and x64 WinDbg

Target:

- Windows 8.1 x64 (ntoskrnl.exe versions: 17085, 17041, 16452)
- Windows 7 SP1 x64 (ntoskrnl.exe versions: 18409, 18247)

License
-----------------
This software is released under the MIT License, see LICENSE.
