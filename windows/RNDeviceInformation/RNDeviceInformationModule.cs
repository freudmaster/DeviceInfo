using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Device.Information.RNDeviceInformation
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNDeviceInformationModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNDeviceInformationModule"/>.
        /// </summary>
        internal RNDeviceInformationModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNDeviceInformation";
            }
        }
    }
}
