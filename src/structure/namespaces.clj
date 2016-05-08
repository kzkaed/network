(ns structure.namespaces)

(def namespaces
  ["axus.admin.advisor.controller" "axus.admin.advisor.crud-controller" "axus.admin.advisor.invite-advisor" "axus.admin.advisor.presenter" "axus.admin.advisor.repository" "axus.admin.advisor.validation" "axus.admin.booking.accommodation.merger" "axus.admin.booking.accommodation.presenter" "axus.admin.booking.accommodation.repository" "axus.admin.booking.accommodation.service" "axus.admin.booking.actions" "axus.admin.booking.common-controller" "axus.admin.booking.concierge.duration" "axus.admin.booking.concierge.presenter" "axus.admin.booking.concierge.repository" "axus.admin.booking.concierge.service" "axus.admin.booking.core" "axus.admin.booking.creator" "axus.admin.booking.cruise.port.repository" "axus.admin.booking.cruise.presenter" "axus.admin.booking.cruise.repository" "axus.admin.booking.cruise.service" "axus.admin.booking.deleter" "axus.admin.booking.duplicater" "axus.admin.booking.finder" "axus.admin.booking.flight.core" "axus.admin.booking.flight.merger" "axus.admin.booking.flight.passenger.repository" "axus.admin.booking.flight.presenter" "axus.admin.booking.flight.repository" "axus.admin.booking.flight.service" "axus.admin.booking.image" "axus.admin.booking.insurance.presenter" "axus.admin.booking.insurance.repository" "axus.admin.booking.insurance.service" "axus.admin.booking.merge-dispatcher" "axus.admin.booking.modifier" "axus.admin.booking.nights-stayed" "axus.admin.booking.other.presenter" "axus.admin.booking.other.repository" "axus.admin.booking.other.service" "axus.admin.booking.presenter" "axus.admin.booking.tour.presenter" "axus.admin.booking.tour.repository" "axus.admin.booking.tour.service" "axus.admin.booking.transportation.presenter" "axus.admin.booking.transportation.repository" "axus.admin.booking.transportation.service" "axus.admin.booking.unassociated-controller" "axus.admin.booking.unassociated-presenter" "axus.admin.booking.updater" "axus.admin.booking.upserter" "axus.admin.common-controller-actions" "axus.admin.dashboard.controller" "axus.admin.feature.repository" "axus.admin.feature.service" "axus.admin.guide.client" "axus.admin.guide.controller" "axus.admin.guide.importer" "axus.admin.guide.repository" "axus.admin.itinerary.brander" "axus.admin.itinerary.core" "axus.admin.itinerary.crud-controller" "axus.admin.itinerary.importer" "axus.admin.itinerary.list-builder" "axus.admin.itinerary.list-controller" "axus.admin.itinerary.message.crud-controller" "axus.admin.itinerary.message.notification" "axus.admin.itinerary.message.presenter" "axus.admin.itinerary.message.repository" "axus.admin.itinerary.message.validation" "axus.admin.itinerary.overview" "axus.admin.itinerary.presenter" "axus.admin.itinerary.publish" "axus.admin.itinerary.traveler-controller" "axus.admin.notification.controller" "axus.admin.notification.core" "axus.admin.notification.presenter" "axus.admin.notification.repository" "axus.admin.organization.crud-controller" "axus.admin.organization.search-presenter" "axus.admin.organization.stylesheet" "axus.admin.organization.update-subscription" "axus.admin.profile.controller" "axus.admin.profile.presenter" "axus.admin.rescard-parsing" "axus.admin.root" "axus.admin.subscriber.core" "axus.admin.subscriber.repository" "axus.admin.subscription.controller" "axus.admin.subscription.core" "axus.admin.subscription.details-lookup" "axus.admin.subscription.details-presenter" "axus.admin.subscription.notification" "axus.admin.subscription.presenter" "axus.admin.subscription.repository" "axus.admin.subscription.updater" "axus.admin.subscription.validation" "axus.admin.supporting-document.controller" "axus.admin.supporting-document.repository" "axus.admin.traveler.controller" "axus.admin.traveler.presenter" "axus.admin.traveler.repository" "axus.admin.vendor.controller" "axus.admin.vendor.repository" "axus.admin.vendor.types" "axus.admin.view-constants" "axus.agency.repository" "axus.airbrake" "axus.airbrake.core" "axus.airbrake.ring" "axus.api.accommodation-details" "axus.api.accommodation-suggestions" "axus.api.collaborator-suggestions" "axus.api.concierge-suggestions" "axus.api.device" "axus.api.device.presenter" "axus.api.docs-controller" "axus.api.guides" "axus.api.import.controller" "axus.api.import.importer" "axus.api.import.parser" "axus.api.insurance-suggestions" "axus.api.itinerary-suggestions" "axus.api.messages" "axus.api.organization-presenter" "axus.api.presenter" "axus.api.root" "axus.api.suggestions" "axus.api.token-authenticated-routes" "axus.api.token-repository" "axus.api.tour-suggestions" "axus.api.traveler-suggestions" "axus.api.voucher" "axus.authentication.basic" "axus.authentication.controller" "axus.authentication.core" "axus.authentication.oauth" "axus.authentication.oauth-controller" "axus.authentication.oauth-token-repository" "axus.authorization.core" "axus.authorization.middleware" "axus.authorization.rules" "axus.booking.sort" "axus.booking-parser" "axus.brand.config" "axus.calypso.client" "axus.calypso.extractor" "axus.calypso.extractor.core" "axus.calypso.extractor.flight" "axus.calypso.extractor.hotel" "axus.calypso.extractor.other" "axus.calypso.extractor.tour" "axus.calypso.extractor.transfer" "axus.calypso.parser" "axus.calypso.parser.core" "axus.calypso.parser.tour" "axus.cdq.import-bookings" "axus.cdq.import-itinerary" "axus.cdq.import-travelers" "axus.cdq.importer" "axus.cdq.match-advisors" "axus.cdq.parser" "axus.cdq.provider-types" "axus.cdq.repository" "axus.classic.import" "axus.classic.importer" "axus.classic.parser" "axus.classic.repository" "axus.clientbase.booking" "axus.clientbase.import-profile" "axus.clientbase.itinerary" "axus.collaborators.service" "axus.core" "axus.database.actions" "axus.database.data-cleanup.stale-passengers" "axus.database.encryption" "axus.database.entities" "axus.database.helpers" "axus.database.model-transformations" "axus.database-client" "axus.delete-advisor" "axus.deploy-helpers" "axus.dev-main" "axus.duration-presenter" "axus.email.mandrill" "axus.email.read-mail-client" "axus.email.send" "axus.email.smtp" "axus.environment" "axus.flightstats.events" "axus.flightstats.registration" "axus.flightstats.root" "axus.google.places-api" "axus.google.presenter" "axus.guide.datafile" "axus.health-check" "axus.help" "axus.http.dispatch" "axus.http-server" "axus.invitation.repository" "axus.invitation.root" "axus.itinerary.repository" "axus.itinerary.upserter" "axus.jasmine" "axus.jobs.queue" "axus.jobs.queue-protocol" "axus.jobs.sqs-queue" "axus.live-connect.importer" "axus.live-connect.parser" "axus.live-connect.rescard" "axus.logging" "axus.mail-chimp.mail-chimp" "axus.message" "axus.middleware" "axus.notification.bookings" "axus.notification.consumer" "axus.notification.consumer.apns" "axus.notification.consumer.apns.client" "axus.notification.consumer.apns.java-client" "axus.notification.consumer.bookings" "axus.notification.consumer.core" "axus.notification.consumer.gcms" "axus.notification.consumer.runner" "axus.notification.device-repository" "axus.notification.itinerary-notification-repository" "axus.option.organization.repository" "axus.option.organization.service" "axus.organization.data-parser" "axus.organization.presenter" "axus.organization.repository" "axus.organization.status-repository" "axus.organization.validation" "axus.payments.accept-payment" "axus.payments.braintree-filter" "axus.payments.braintree-payment-client" "axus.payments.payment-client" "axus.payments.promo-codes" "axus.payments.webhook.root" "axus.pdf.factory" "axus.pdf.presenter" "axus.periscope" "axus.plan.core" "axus.plan.presenter" "axus.plan.repository" "axus.plan.voucher" "axus.policies.root" "axus.prod-main" "axus.push-vendor.repository" "axus.reset-password.controller" "axus.reset-password.core" "axus.reset-password.presenter" "axus.reset-password.token-repository" "axus.reset-password.validation" "axus.sabre.client" "axus.sabre.extractor" "axus.sabre.extractor.core" "axus.sabre.extractor.cruise" "axus.sabre.extractor.customer" "axus.sabre.extractor.flight" "axus.sabre.extractor.hotel" "axus.sabre.extractor.insurance" "axus.sabre.extractor.other-booking" "axus.sabre.extractor.rail" "axus.sabre.extractor.tour" "axus.sabre.extractor.vehicle" "axus.sabre.importer" "axus.sabre.parser" "axus.sabre.parser.core" "axus.sabre.parser.cruise" "axus.sabre.parser.customer" "axus.sabre.parser.flight" "axus.sabre.parser.hotel" "axus.sabre.parser.insurance" "axus.sabre.parser.itinerary" "axus.sabre.parser.other-booking" "axus.sabre.parser.rail" "axus.sabre.parser.tour" "axus.sabre.parser.vehicle" "axus.session" "axus.shared.root" "axus.shutdown" "axus.signature-travel-network.accommodation-image-transformer" "axus.signature-travel-network.accommodation-transformer" "axus.sql-logging" "axus.suggestions.presenter" "axus.task.add-leading-zeros-to-iata-numbers" "axus.task.compile-assets" "axus.task.generate-promo-code" "axus.task.generate-vouchers" "axus.task.helper" "axus.task.import-cdq-data" "axus.task.load-signature-accommodations" "axus.task.load-signature-accommodations-importer" "axus.task.load-signature-iatas" "axus.task.load-virtuoso-accommodations" "axus.task.move-data-to-jetset-organization" "axus.task.onboard-cdq-organization" "axus.task.run-jobs" "axus.task.seed" "axus.task.send-annual-billing-and-trial-ending-emails" "axus.time" "axus.time.interval" "axus.time.parsing" "axus.time.presentation" "axus.translate-errors" "axus.tripit.accommodation-parser" "axus.tripit.client" "axus.tripit.confirmation-matcher" "axus.tripit.cruise-parser" "axus.tripit.email-processor" "axus.tripit.flight-parser" "axus.tripit.parser-utilities" "axus.tripit.rail-parser" "axus.tripit.rental-car-parser" "axus.tripit.restaurant-parser" "axus.tripit.transfer-parser" "axus.users.collaborator.controller" "axus.users.presenter" "axus.users.repository" "axus.users.root" "axus.users.validation" "axus.utilities.airlines" "axus.utilities.airports" "axus.utilities.background-jobs" "axus.utilities.base64" "axus.utilities.constants" "axus.utilities.data-structures" "axus.utilities.file-system" "axus.utilities.formatting" "axus.utilities.http" "axus.utilities.image-upload" "axus.utilities.javascript" "axus.utilities.json" "axus.utilities.macros" "axus.utilities.mock-s3-wrapper" "axus.utilities.parse-itinerary" "axus.utilities.parsing" "axus.utilities.presentation" "axus.utilities.real-s3-wrapper" "axus.utilities.render" "axus.utilities.response" "axus.utilities.retry" "axus.utilities.routing" "axus.utilities.s3-wrapper" "axus.utilities.soap" "axus.utilities.sorting" "axus.utilities.string" "axus.utilities.uuid" "axus.utilities.validation" "axus.utilities.xml" "axus.virtuoso.accommodations-parser" "axus.virtuoso.connection" "axus.worldmate.accommodation-parser" "axus.worldmate.flight-parser" "axus.worldmate.parser-utilities" "monkeypatches.joda-time" "monkeypatches.rotor" "axus.repl" "axus.admin.advisor.controller-spec" "axus.admin.advisor.crud-controller-spec" "axus.admin.advisor.invite-advisor-spec" "axus.admin.advisor.presenter-spec" "axus.admin.advisor.repository-spec" "axus.admin.advisor.validation-spec" "axus.admin.booking.accommodation.merger-spec" "axus.admin.booking.accommodation.presenter-spec" "axus.admin.booking.accommodation.repository-spec" "axus.admin.booking.accommodation.service-spec" "axus.admin.booking.actions-spec" "axus.admin.booking.common-controller-integration-spec" "axus.admin.booking.common-controller-spec" "axus.admin.booking.concierge.duration-spec" "axus.admin.booking.concierge.presenter-spec" "axus.admin.booking.concierge.repository-spec" "axus.admin.booking.concierge.service-spec" "axus.admin.booking.core-spec" "axus.admin.booking.cruise.port.repository-spec" "axus.admin.booking.cruise.presenter-spec" "axus.admin.booking.cruise.repository-spec" "axus.admin.booking.cruise.service-spec" "axus.admin.booking.duplicater-spec" "axus.admin.booking.flight.merger-spec" "axus.admin.booking.flight.passenger.repository-spec" "axus.admin.booking.flight.presenter-spec" "axus.admin.booking.flight.repository-spec" "axus.admin.booking.flight.service-spec" "axus.admin.booking.image-spec" "axus.admin.booking.insurance.presenter-spec" "axus.admin.booking.insurance.repository-spec" "axus.admin.booking.insurance.service-spec" "axus.admin.booking.merge-dispatcher-spec" "axus.admin.booking.nights-stayed-spec" "axus.admin.booking.notifications" "axus.admin.booking.other.presenter-spec" "axus.admin.booking.other.repository-spec" "axus.admin.booking.other.service-spec" "axus.admin.booking.presenter-spec" "axus.admin.booking.tour.presenter-spec" "axus.admin.booking.tour.repository-spec" "axus.admin.booking.tour.service-spec" "axus.admin.booking.transportation.presenter-spec" "axus.admin.booking.transportation.repository-spec" "axus.admin.booking.transportation.service-spec" "axus.admin.booking.unassociated-controller-spec" "axus.admin.booking.unassociated-presenter-spec" "axus.admin.booking.upserter-spec" "axus.admin.common-controller-actions-spec" "axus.admin.dashboard.controller-spec" "axus.admin.feature.repository-spec" "axus.admin.feature.service-spec" "axus.admin.guide.client-spec" "axus.admin.guide.controller-spec" "axus.admin.guide.importer-spec" "axus.admin.guide.repository-spec" "axus.admin.itinerary.brander-spec" "axus.admin.itinerary.core-spec" "axus.admin.itinerary.crud-controller-spec" "axus.admin.itinerary.list-builder-spec" "axus.admin.itinerary.list-controller-spec" "axus.admin.itinerary.message.crud-controller-spec" "axus.admin.itinerary.message.notification-spec" "axus.admin.itinerary.message.presenter-spec" "axus.admin.itinerary.message.repository-spec" "axus.admin.itinerary.message.validation-spec" "axus.admin.itinerary.overview-spec" "axus.admin.itinerary.presenter-spec" "axus.admin.itinerary.publish-spec" "axus.admin.itinerary.traveler-controller-spec" "axus.admin.notification.controller-spec" "axus.admin.notification.core-spec" "axus.admin.notification.presenter-spec" "axus.admin.notification.repository-spec" "axus.admin.organization.crud-controller-spec" "axus.admin.organization.stylesheet-spec" "axus.admin.profile.controller-spec" "axus.admin.profile.presenter-spec" "axus.admin.root-spec" "axus.admin.subscriber.repository-spec" "axus.admin.subscription.controller-spec" "axus.admin.subscription.core-spec" "axus.admin.subscription.notification-spec" "axus.admin.subscription.presenter-spec" "axus.admin.subscription.repository-spec" "axus.admin.subscription.updater-spec" "axus.admin.subscription.validation-spec" "axus.admin.supporting-document.controller-spec" "axus.admin.supporting-document.repository-spec" "axus.admin.traveler.crud-controller-spec" "axus.admin.traveler.presenter-spec" "axus.admin.traveler.repository-spec" "axus.admin.vendor.controller-spec" "axus.admin.vendor.repository-spec" "axus.airbrake.core-spec" "axus.airbrake.ring-spec" "axus.api.accommodation-suggestions-spec" "axus.api.collaborator-suggestions-spec" "axus.api.concierge-suggestions-spec" "axus.api.device.presenter-spec" "axus.api.device-spec" "axus.api.guides-spec" "axus.api.import.controller-spec" "axus.api.import.importer-spec" "axus.api.import.parser-spec" "axus.api.insurance-suggestions-spec" "axus.api.itinerary-suggestions-spec" "axus.api.messages-spec" "axus.api.organization-presenter-spec" "axus.api.presenter-spec" "axus.api.root-spec" "axus.api.token-authenticated-routes-spec" "axus.api.token-repository-spec" "axus.api.tour-suggestions-spec" "axus.api.traveler-suggestions-spec" "axus.authentication.basic-spec" "axus.authentication.controller-spec" "axus.authentication.core-spec" "axus.authentication.oauth-controller-spec" "axus.authentication.oauth-spec" "axus.authentication.oauth-token-repository-spec" "axus.authorization.core-spec" "axus.authorization.middleware-spec" "axus.authorization.rules-spec" "axus.booking.sort-spec" "axus.booking-parser-spec" "axus.brand.config-spec" "axus.calypso.client-spec" "axus.calypso.extractor.flight-spec" "axus.calypso.extractor.hotel-spec" "axus.calypso.extractor.other-spec" "axus.calypso.extractor.passenger-spec" "axus.calypso.extractor.tour-spec" "axus.calypso.extractor.transfer-spec" "axus.calypso.extractor-spec" "axus.calypso.importer-spec" "axus.calypso.parser.flight-spec" "axus.calypso.parser.hotel-spec" "axus.calypso.parser.other-spec" "axus.calypso.parser.passenger-spec" "axus.calypso.parser.tour-spec" "axus.calypso.parser.transfer-spec" "axus.cdq.import-bookings-spec" "axus.cdq.import-itinerary-spec" "axus.cdq.import-travelers-spec" "axus.cdq.importer.data" "axus.cdq.importer.helper" "axus.cdq.importer-spec" "axus.cdq.match-advisors-spec" "axus.cdq.parser-spec" "axus.cdq.repository-spec" "axus.classic.import-spec" "axus.classic.importer-spec" "axus.classic.parser-spec" "axus.classic.repository-spec" "axus.collaborators.service-spec" "axus.core-spec" "axus.database.actions-spec" "axus.database.data-cleanup.stale-passengers-spec" "axus.database.encryption-spec" "axus.database.entities-spec" "axus.database.model-transformations-spec" "axus.delete-advisor-spec" "axus.duration-presenter-spec" "axus.email.mandrill-spec" "axus.email.read-mail-client-spec" "axus.email.send-spec" "axus.environment-spec" "axus.flightstats.events-spec" "axus.flightstats.registration-spec" "axus.flightstats.root-spec" "axus.google.places-api-spec" "axus.google.presenter-spec" "axus.guide.datafile-spec" "axus.health-check-spec" "axus.http.dispatch-spec" "axus.invitation.repository-spec" "axus.invitation.root-spec" "axus.itinerary.repository-spec" "axus.itinerary.upserter-spec" "axus.jobs.fake-queue" "axus.jobs.queue-spec-helper" "axus.jobs.sqs-queue-spec" "axus.live-connect.importer-spec" "axus.live-connect.rescard-spec" "axus.logging-spec" "axus.mail-chimp.mail-chimp-spec" "axus.message-spec" "axus.middleware-spec" "axus.notification.bookings.fake" "axus.notification.bookings-spec" "axus.notification.consumer.apns.mock-client" "axus.notification.consumer.apns.spec-helper" "axus.notification.consumer.apns_spec" "axus.notification.consumer.bookings-spec" "axus.notification.consumer.core_spec" "axus.notification.consumer.gcms-spec" "axus.notification.consumer.runner-spec" "axus.notification.consumer-spec" "axus.notification.device-repository-spec" "axus.notification.emails-spec" "axus.notification.itinerary-notification-repository-spec" "axus.option.organization.repository-spec" "axus.option.organization.service-spec" "axus.organization.data-parser-spec" "axus.organization.presenter-spec" "axus.organization.repository-spec" "axus.organization.status-repository-spec" "axus.organization.validation-spec" "axus.payments.accept-payment-spec" "axus.payments.braintree-filter-spec" "axus.payments.braintree-payment-client-spec" "axus.payments.mock-payment-client" "axus.payments.promo-codes-spec" "axus.payments.webhook.root-spec" "axus.pdf.factory-spec" "axus.pdf.presenter-spec" "axus.periscope-spec" "axus.plan.core-spec" "axus.plan.presenter-spec" "axus.plan.repository-spec" "axus.plan.voucher-spec" "axus.prod-main-spec" "axus.push-vendor.repository-spec" "axus.reset-password.controller-spec" "axus.reset-password.core-spec" "axus.reset-password.token-repository-spec" "axus.reset-password.validation-spec" "axus.sabre.client-spec" "axus.sabre.extractor.cruise-spec" "axus.sabre.extractor.customer-spec" "axus.sabre.extractor.flight-spec" "axus.sabre.extractor.hotel-spec" "axus.sabre.extractor.insurance-spec" "axus.sabre.extractor.other-booking-spec" "axus.sabre.extractor.rail-spec" "axus.sabre.extractor.tour-spec" "axus.sabre.extractor.vehicle-spec" "axus.sabre.extractor-spec" "axus.sabre.importer-spec" "axus.sabre.parser.cruise-spec" "axus.sabre.parser.customer-spec" "axus.sabre.parser.flight-spec" "axus.sabre.parser.hotel-spec" "axus.sabre.parser.insurance-spec" "axus.sabre.parser.itinerary-spec" "axus.sabre.parser.other-booking-spec" "axus.sabre.parser.rail-spec" "axus.sabre.parser.tour-spec" "axus.sabre.parser.vehicle-spec" "axus.shared.root-spec" "axus.signature-travel-network.accommodation-image-transformer-spec" "axus.signature-travel-network.accommodation-transformer-spec" "axus.spec-helper" "axus.spec-helper.async" "axus.spec-state" "axus.suggestions.presenter-spec" "axus.task.associate-advisors-spec" "axus.task.compile-assets-spec" "axus.task.generate-vouchers-spec" "axus.task.load-signature-accommodations-importer-spec" "axus.time.parsing-spec" "axus.time.presentation-spec" "axus.time-spec" "axus.translate-errors-spec" "axus.tripit.accommodation-parser-spec" "axus.tripit.client-spec" "axus.tripit.confirmation-matcher-spec" "axus.tripit.cruise-parser-spec" "axus.tripit.email-processor-spec" "axus.tripit.flight-parser-spec" "axus.tripit.parser-utilities-spec" "axus.tripit.rail-parser-spec" "axus.tripit.rental-car-parser-spec" "axus.tripit.restaurant-parser-spec" "axus.tripit.transfer-parser-spec" "axus.users.collaborator.controller-spec" "axus.users.presenter-spec" "axus.users.repository-spec" "axus.users.root-spec" "axus.users.validation-spec" "axus.utilities.airlines-spec" "axus.utilities.airports-spec" "axus.utilities.data-structures-spec" "axus.utilities.formatting-spec" "axus.utilities.html-tags-stripper-spec" "axus.utilities.image-upload_spec" "axus.utilities.macros-spec" "axus.utilities.parsing-spec" "axus.utilities.presentation-spec" "axus.utilities.render-spec" "axus.utilities.retry-spec" "axus.utilities.soap-spec" "axus.utilities.sorting-spec" "axus.utilities.string-spec" "axus.utilities.validation-spec" "axus.utilities.xml-spec" "axus.virtuoso.accommodation-parser-spec" "axus.worldmate.accommodation-parser-spec" "axus.worldmate.flight-parser-spec" "axus.worldmate.parser-utilities-spec" "monkeypatches.joda-time-spec" "axus.admin.advisor.controller" "axus.admin.advisor.crud-controller" "axus.admin.advisor.invite-advisor" "axus.admin.advisor.presenter" "axus.admin.advisor.repository" "axus.admin.advisor.validation" "axus.admin.booking.accommodation.merger" "axus.admin.booking.accommodation.presenter" "axus.admin.booking.accommodation.repository" "axus.admin.booking.accommodation.service" "axus.admin.booking.actions" "axus.admin.booking.common-controller" "axus.admin.booking.concierge.duration" "axus.admin.booking.concierge.presenter" "axus.admin.booking.concierge.repository" "axus.admin.booking.concierge.service" "axus.admin.booking.core" "axus.admin.booking.creator" "axus.admin.booking.cruise.port.repository" "axus.admin.booking.cruise.presenter" "axus.admin.booking.cruise.repository" "axus.admin.booking.cruise.service" "axus.admin.booking.deleter" "axus.admin.booking.duplicater" "axus.admin.booking.finder" "axus.admin.booking.flight.core" "axus.admin.booking.flight.merger" "axus.admin.booking.flight.passenger.repository" "axus.admin.booking.flight.presenter" "axus.admin.booking.flight.repository" "axus.admin.booking.flight.service" "axus.admin.booking.image" "axus.admin.booking.insurance.presenter" "axus.admin.booking.insurance.repository" "axus.admin.booking.insurance.service" "axus.admin.booking.merge-dispatcher" "axus.admin.booking.modifier" "axus.admin.booking.nights-stayed" "axus.admin.booking.other.presenter" "axus.admin.booking.other.repository" "axus.admin.booking.other.service" "axus.admin.booking.presenter" "axus.admin.booking.tour.presenter" "axus.admin.booking.tour.repository" "axus.admin.booking.tour.service" "axus.admin.booking.transportation.presenter" "axus.admin.booking.transportation.repository" "axus.admin.booking.transportation.service" "axus.admin.booking.unassociated-controller" "axus.admin.booking.unassociated-presenter" "axus.admin.booking.updater" "axus.admin.booking.upserter" "axus.admin.common-controller-actions" "axus.admin.dashboard.controller" "axus.admin.feature.repository" "axus.admin.feature.service" "axus.admin.guide.client" "axus.admin.guide.controller" "axus.admin.guide.importer" "axus.admin.guide.repository" "axus.admin.itinerary.brander" "axus.admin.itinerary.core" "axus.admin.itinerary.crud-controller" "axus.admin.itinerary.importer" "axus.admin.itinerary.list-builder" "axus.admin.itinerary.list-controller" "axus.admin.itinerary.message.crud-controller" "axus.admin.itinerary.message.notification" "axus.admin.itinerary.message.presenter" "axus.admin.itinerary.message.repository" "axus.admin.itinerary.message.validation" "axus.admin.itinerary.overview" "axus.admin.itinerary.presenter" "axus.admin.itinerary.publish" "axus.admin.itinerary.traveler-controller" "axus.admin.notification.controller" "axus.admin.notification.core" "axus.admin.notification.presenter" "axus.admin.notification.repository" "axus.admin.organization.crud-controller" "axus.admin.organization.search-presenter" "axus.admin.organization.stylesheet" "axus.admin.organization.update-subscription" "axus.admin.profile.controller" "axus.admin.profile.presenter" "axus.admin.root" "axus.admin.subscriber.core" "axus.admin.subscriber.repository" "axus.admin.subscription.controller" "axus.admin.subscription.core" "axus.admin.subscription.details-lookup" "axus.admin.subscription.details-presenter" "axus.admin.subscription.notification" "axus.admin.subscription.presenter" "axus.admin.subscription.repository" "axus.admin.subscription.updater" "axus.admin.subscription.validation" "axus.admin.supporting-document.controller" "axus.admin.supporting-document.repository" "axus.admin.traveler.controller" "axus.admin.traveler.presenter" "axus.admin.traveler.repository" "axus.admin.vendor.controller" "axus.admin.vendor.repository" "axus.admin.vendor.types" "axus.admin.view-constants" "axus.agency.repository" "axus.airbrake" "axus.airbrake.core" "axus.airbrake.ring" "axus.api.accommodation-suggestions" "axus.api.booking-details" "axus.api.collaborator-suggestions" "axus.api.concierge-suggestions" "axus.api.device" "axus.api.device.presenter" "axus.api.docs-controller" "axus.api.guides" "axus.api.import.controller" "axus.api.import.importer" "axus.api.import.parser" "axus.api.insurance-suggestions" "axus.api.itinerary-suggestions" "axus.api.messages" "axus.api.organization-presenter" "axus.api.presenter" "axus.api.root" "axus.api.suggestions" "axus.api.token-authenticated-routes" "axus.api.token-repository" "axus.api.tour-suggestions" "axus.api.traveler-suggestions" "axus.api.voucher" "axus.authentication.basic" "axus.authentication.controller" "axus.authentication.core" "axus.authentication.oauth" "axus.authentication.oauth-controller" "axus.authentication.oauth-token-repository" "axus.authorization.core" "axus.authorization.middleware" "axus.authorization.rules" "axus.booking.sort" "axus.booking-parser" "axus.brand.config" "axus.calypso.client" "axus.calypso.extractor" "axus.calypso.extractor.core" "axus.calypso.extractor.flight" "axus.calypso.extractor.hotel" "axus.calypso.extractor.other" "axus.calypso.extractor.passenger" "axus.calypso.extractor.tour" "axus.calypso.extractor.transfer" "axus.calypso.importer" "axus.calypso.parser" "axus.calypso.parser.core" "axus.calypso.parser.flight" "axus.calypso.parser.hotel" "axus.calypso.parser.other" "axus.calypso.parser.passenger" "axus.calypso.parser.tour" "axus.calypso.parser.transfer" "axus.cdq.import-bookings" "axus.cdq.import-itinerary" "axus.cdq.import-travelers" "axus.cdq.importer" "axus.cdq.match-advisors" "axus.cdq.parser" "axus.cdq.provider-types" "axus.cdq.repository" "axus.classic.import" "axus.classic.importer" "axus.classic.parser" "axus.classic.repository" "axus.collaborators.service" "axus.core" "axus.database.actions" "axus.database.data-cleanup.stale-passengers" "axus.database.encryption" "axus.database.entities" "axus.database.helpers" "axus.database.model-transformations" "axus.database-client" "axus.delete-advisor" "axus.deploy-helpers" "axus.dev-main" "axus.duration-presenter" "axus.email.mandrill" "axus.email.read-mail-client" "axus.email.send" "axus.email.smtp" "axus.environment" "axus.flightstats.events" "axus.flightstats.registration" "axus.flightstats.root" "axus.google.places-api" "axus.google.presenter" "axus.guide.datafile" "axus.health-check" "axus.help" "axus.http.dispatch" "axus.http-server" "axus.invitation.repository" "axus.invitation.root" "axus.itinerary.repository" "axus.itinerary.upserter" "axus.jasmine" "axus.jobs.consumer" "axus.jobs.queue" "axus.jobs.queue-protocol" "axus.jobs.sqs-queue" "axus.live-connect.importer" "axus.live-connect.parser" "axus.live-connect.rescard" "axus.logging" "axus.mail-chimp.mail-chimp" "axus.message" "axus.middleware" "axus.notification.bookings" "axus.notification.consumer" "axus.notification.consumer.apns" "axus.notification.consumer.apns.client" "axus.notification.consumer.apns.java-client" "axus.notification.consumer.bookings" "axus.notification.consumer.core" "axus.notification.consumer.gcms" "axus.notification.consumer.runner" "axus.notification.device-repository" "axus.notification.emails" "axus.notification.itinerary-notification-repository" "axus.option.organization.repository" "axus.option.organization.service" "axus.organization.data-parser" "axus.organization.presenter" "axus.organization.repository" "axus.organization.status-repository" "axus.organization.validation" "axus.payments.accept-payment" "axus.payments.braintree-filter" "axus.payments.braintree-payment-client" "axus.payments.payment-client" "axus.payments.promo-codes" "axus.payments.webhook.root" "axus.pdf.factory" "axus.pdf.presenter" "axus.periscope" "axus.plan.core" "axus.plan.presenter" "axus.plan.repository" "axus.plan.voucher" "axus.policies.root" "axus.prod-main" "axus.push-vendor.repository" "axus.reset-password.controller" "axus.reset-password.core" "axus.reset-password.presenter" "axus.reset-password.token-repository" "axus.reset-password.validation" "axus.sabre.client" "axus.sabre.extractor" "axus.sabre.extractor.core" "axus.sabre.extractor.cruise" "axus.sabre.extractor.customer" "axus.sabre.extractor.flight" "axus.sabre.extractor.hotel" "axus.sabre.extractor.insurance" "axus.sabre.extractor.other-booking" "axus.sabre.extractor.rail" "axus.sabre.extractor.tour" "axus.sabre.extractor.vehicle" "axus.sabre.importer" "axus.sabre.parser" "axus.sabre.parser.core" "axus.sabre.parser.cruise" "axus.sabre.parser.customer" "axus.sabre.parser.flight" "axus.sabre.parser.hotel" "axus.sabre.parser.insurance" "axus.sabre.parser.itinerary" "axus.sabre.parser.other-booking" "axus.sabre.parser.rail" "axus.sabre.parser.tour" "axus.sabre.parser.vehicle" "axus.session" "axus.shared.root" "axus.shutdown" "axus.signature-travel-network.accommodation-image-transformer" "axus.signature-travel-network.accommodation-transformer" "axus.sql-logging" "axus.suggestions.presenter" "axus.task.add-leading-zeros-to-iata-numbers" "axus.task.compile-assets" "axus.task.fix-non-axus-images" "axus.task.generate-promo-code" "axus.task.generate-vouchers" "axus.task.helper" "axus.task.import-cdq-data" "axus.task.load-signature-accommodations" "axus.task.load-signature-accommodations-importer" "axus.task.load-signature-iatas" "axus.task.load-virtuoso-accommodations" "axus.task.move-data-to-jetset-organization" "axus.task.onboard-cdq-organization" "axus.task.run-jobs" "axus.task.seed" "axus.task.send-annual-billing-and-trial-ending-emails" "axus.time" "axus.time.interval" "axus.time.parsing" "axus.time.presentation" "axus.translate-errors" "axus.tripit.accommodation-parser" "axus.tripit.client" "axus.tripit.confirmation-matcher" "axus.tripit.cruise-parser" "axus.tripit.email-processor" "axus.tripit.flight-parser" "axus.tripit.parser-utilities" "axus.tripit.rail-parser" "axus.tripit.rental-car-parser" "axus.tripit.restaurant-parser" "axus.tripit.transfer-parser" "axus.users.collaborator.controller" "axus.users.presenter" "axus.users.repository" "axus.users.root" "axus.users.validation" "axus.utilities.airlines" "axus.utilities.airports" "axus.utilities.background-jobs" "axus.utilities.base64" "axus.utilities.constants" "axus.utilities.data-structures" "axus.utilities.file-system" "axus.utilities.formatting" "axus.utilities.html-tags-stripper" "axus.utilities.http" "axus.utilities.image-upload" "axus.utilities.javascript" "axus.utilities.json" "axus.utilities.macros" "axus.utilities.mock-s3-wrapper" "axus.utilities.parsing" "axus.utilities.presentation" "axus.utilities.real-s3-wrapper" "axus.utilities.render" "axus.utilities.response" "axus.utilities.retry" "axus.utilities.routing" "axus.utilities.s3-wrapper" "axus.utilities.soap" "axus.utilities.sorting" "axus.utilities.string" "axus.utilities.uuid" "axus.utilities.validation" "axus.utilities.xml" "axus.virtuoso.accommodations-parser" "axus.virtuoso.connection" "axus.worldmate.accommodation-parser" "axus.worldmate.flight-parser" "axus.worldmate.parser-utilities" "monkeypatches.joda-time" "monkeypatches.rotor"])


(def set-of-ignored-ns
  #{"clojure.core"
    "clojure.tools.logging"
    "clojure.tools.logging.impl"
    "clojure.core.async.impl"
    "clojure.core.async.impl.ioc-macros"
    "clojure.core.async"})
