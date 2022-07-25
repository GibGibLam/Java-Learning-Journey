package com.fdmgroup.pension.task3;

public class PensionController {

	public void handlePensions(Person[] people) {

		String year = "2014";
		PensionLogic logic = new PensionLogic();
		View view = new View();

		for (int i = 0; i < people.length; i++) {

			if (logic.isPensionable(people[i], year))
				view.printEligible(people[i]);
			else
				view.printIneligible(people[i]);

		}

	}
}
