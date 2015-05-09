# donationGame

This program runs a tournament among different strategies which play the donation game (see below). 

Each competitor implements an interface Competitor which can be found in the package br.usp.icmc.ssc01032015.

You can contribute with the donation game creating your own competitor extending the AbstractCompetitor class
and a custom Tournament class.

The tournament happens on a sequence of runs. 
On each run each pair of competitors meet and must decide what to do with a money it receives. 
Each competitor must decide what to do with R$ 10.00 and how much it will give to the other competitor. 

The amount donated will be informed using the **declareDonationTo** method. A value between 0.0 and 10.0 must be given.
Each competitor receive an information of how much it will receive from the other competitor (use for it **informDonationFrom** method ). 

**_Competitors can't ask questions!!!_**

Each competitor receives an amount of money of 10.0 minus the amount given to the other plus 2x what it received from the other. (use the method **addCash**).

You can add your competitors in the package **br.usp.icmc.ssc01032015.competitors_YOUR-ID** and your Tournament classes in the package br.usp.icmc.ssc01032015.tournament_YOUR-ID.
