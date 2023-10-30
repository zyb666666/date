当系统安装的时候，某种原因（没网或其它）导致安装日期不是当前日期，明明今天安装，日期却显示不对， 在注册表修改InstallDate无效（直接转当前日期为时间戳无法正确修改）
进入Windows注册表步骤：
运行->输入regedit->回车（或者CMD输入regedit->回车）
输入：计算机\HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows NT\CurrentVersion->回车
系统关于里面的安装日期是改InstallTime；InstallDate是CMD里的systeminfo的安装日期。
InstallDate是从伦敦时间1970年1月1日到安装时间的总秒数
InstallTime是从伦敦时间1601年1月1日到安装时间的总秒数
windows FILETIME时间从1601/01/01 零时零分零秒开始计时，windows每个时钟滴答将计数加一，每个时钟滴答的间隔是100 nanoseconds（纳秒，1秒=10的九次方纳秒），即每个时钟滴答= 10 （-7）秒。
十进制十进制十进制！！！
