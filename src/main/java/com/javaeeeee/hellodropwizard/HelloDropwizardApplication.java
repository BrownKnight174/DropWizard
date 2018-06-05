package com.javaeeeee.hellodropwizard;

import com.javaeeeee.hellodropwizard.resources.redisResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloDropwizardApplication extends Application<HelloDropwizardConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HelloDropwizardApplication().run(args);
    }

    @Override
    public String getName() {
        return "HelloDropwizard";
    }

    @Override
    public void initialize(final Bootstrap<HelloDropwizardConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final HelloDropwizardConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
//    	DateFormat eventDateFormat = new SimpleDateFormat(configuration.getDateFormat());
//    		    environment.getObjectMapper().setDateFormat(eventDateFormat);
    		final redisResource resource = new redisResource();
    	    environment.jersey().register(resource);
    }

}
